@echo off

echo "Création de la branche exercice_rebase_interactif..."
 
git checkout rebase_interactif
git checkout master
git checkout -b exercice_rebase_interactif

echo "Cherry-pick des commits ..."
echo "Cherry-pick du commit 'premier commit pour calcul (interfaces).'"
git cherry-pick 04f192acfb2fe14e7941f98bb6c29d2325c4ec1b
echo "Cherry-pick du commit 'implémentation d'un calculateur via interpolation quantique.'"
git cherry-pick a55627ee8422d92a869559113a3d01be69cc26c1
echo "Cherry-pick du commit 'test unitaire pour CalculateurDeTempsDexecutionViaInterpolationQuantiqueService.'"
git cherry-pick 65aada585a518c9b65735e5e651c745c93d95dde
echo "Cherry-pick du commit 'fix TU CalculateurDeTempsDexecutionViaInterpolationQuantiqueService.'"
git cherry-pick aa95588b4df368c4a1ecade496197291d719566c
echo "Cherry-pick du commit 'dépendance Jackson + interface service d'export.'"
git cherry-pick 665a5307753d2175316e77be6b629b1d66f54e41
echo "Cherry-pick du commit 'service d'export à fichier plat.'"
git cherry-pick d7d6cf0572d8e5c2c36591b34e2e9028509519ba
echo "Cherry-pick du commit 'service d'export sous forme de fichier.'"
git cherry-pick e8b33f68fd43f89c15716b28f0689675197c13fc
echo "Cherry-pick du commit 'TU de ServiceDExportTempsExecutionPlainTextTest.'"
git cherry-pick 9b50792b708e7d04938b71cf435eb03a50581bb2

echo "Le contexte pour bosser est pret. Go chercher la prime !"