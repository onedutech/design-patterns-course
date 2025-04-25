# Énoncé du TP "Le Canard" – extrait de *Design Patterns Tête la Première*

---

## Contexte

Ce TP s’appuie sur l’exemple pédagogique du livre *Design Patterns Tête la Première* d’Eric Freeman et Elisabeth
Freeman, qui utilise un simulateur de canards pour illustrer le pattern **Stratégie** et d’autres concepts de conception
orientée objet.

L’objectif est de modéliser différents types de canards avec des comportements vol, cancan, et affichage, tout en
permettant de modifier dynamiquement ces comportements sans modifier la hiérarchie de classes.

---

## Objectifs pédagogiques

- Comprendre les limites de l’héritage classique pour modéliser des comportements variables.
- Appliquer le pattern **Stratégie** pour encapsuler les comportements vol et cancan.
- Permettre la modification dynamique des comportements à l’exécution.
- Tester le code en isolant les comportements.
- Découvrir les avantages de la composition sur l’héritage.

---

## Description succincte du TP

1. **Modéliser une classe abstraite `Canard`** avec des méthodes abstraites ou par défaut : `afficher()`, `nager()`, et
   des comportements vol et cancan délégués.

2. **Créer des interfaces `ComportementVol` et `ComportementCancan`** avec des méthodes respectives `voler()`
   et `cancaner()`.

3. **Implémenter plusieurs classes concrètes** pour ces comportements, par exemple :
    - `VolerAvecAiles` (vol normal)
    - `NePasVoler` (vol impossible)
    - `Cancaner` (cancan classique)
    - `Coincoin` (coin-coin)

4. **Dans la classe `Canard`**, encapsuler les comportements vol et cancan via des références aux interfaces, et fournir
   des méthodes pour modifier ces comportements à la volée (`setComportementVol()`, `setComportementCancan()`).

5. **Créer plusieurs sous-classes de `Canard`**, comme `CanardColvert`, `CanardEnPlastique`, etc., qui définissent leur
   propre affichage et comportements par défaut.

6. **Tester le système** en créant des instances de canards, en invoquant leurs méthodes, et en modifiant dynamiquement
   leurs comportements.

---

## Questions et points d’attention

- Pourquoi l’héritage simple ne suffit-il pas pour modéliser les comportements variables des canards ?
- Comment le pattern Stratégie permet-il de séparer ce qui change (comportements) de ce qui reste identique (les
  canards) ?
- Quels sont les avantages de pouvoir modifier un comportement à l’exécution ?
- Comment ce modèle facilite-t-il les tests unitaires ?
- En quoi cette approche améliore-t-elle la maintenabilité et l’extensibilité du code ?

---

## Références

- *Design Patterns Tête la Première*, Eric Freeman & Elisabeth Freeman, chapitre sur le simulateur de canards (pattern
  Stratégie).
- Support
  PDF : [Design Patterns Tête la Première (extrait)](https://perso-laris.univ-angers.fr/~delanoue/polytech/design_pattern/support/bates_design-patterns-tete-la-premiere.pdf)
- Présentation détaillée du pattern Stratégie dans le contexte du canard : pages 10 à 30 du livre.

---

Ce TP ludique et pédagogique vous permettra de comprendre en profondeur l’intérêt des design patterns pour créer des
logiciels flexibles, évolutifs et faciles à maintenir, en vous appuyant sur un exemple concret et visuel.

---
