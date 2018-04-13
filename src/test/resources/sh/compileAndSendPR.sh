#!/bin/bash

parse_git_branch()
{
   export BRANCH=$(git symbolic-ref HEAD --short 2> /dev/null)
      if [[ ! -z "$BRANCH" ]]
            then
                      echo "(current branch is $BRANCH)"
            fi
}


parse_git_branch
mvn clean install
#if compilation fail script will exit

git commit -a -m "$1"

export title=$1
export body=$2
export head=$BRANCH

generate_post_data()
{
        cat <<-EOF
{
  "title": "$title", "body": "$body", "head": "$head", "base": "master"
}
EOF
}

echo $(generate_post_data)
curl -i --user "login:password" --request POST -H "Accept: application/json" -H "Content-Type:application/json" --data "$(generate_post_data)" "https://api.github.com/repos/efluid/jeTestDoncJeSuis-hol/pulls"

exit 0
