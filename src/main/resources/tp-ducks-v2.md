# Énoncé du TP "Le Canard" – Exploration des design patterns

---

## Contexte

Dans ce TP, vous êtes invités à modéliser un système de canards avec des comportements variés (vol, cancan, affichage).
L’objectif est de réfléchir à la meilleure manière d’organiser ces comportements pour obtenir un code flexible,
réutilisable et facile à faire évoluer.

---

## Objectifs pédagogiques

- Identifier les limites de l’héritage classique pour gérer des comportements variables.
- Explorer des solutions permettant de séparer les comportements du reste de la classe.
- Comprendre comment rendre les comportements interchangeables et modifiables à l’exécution.
- Favoriser la composition d’objets plutôt que l’héritage rigide.
- Développer une approche modulaire facilitant les tests et l’évolution.

---

## Pistes de réflexion

1. **Modélisation initiale**  
   Comment représenter une classe `Canard` avec des comportements comme voler, cancaner, et afficher ?  
   Quels problèmes pouvez-vous anticiper si vous implémentez ces comportements directement dans la classe ou dans ses
   sous-classes ?

2. **Comportements variables**  
   Comment pourriez-vous isoler les comportements vol et cancan pour qu’ils soient indépendants des types de canards ?  
   Quelles interfaces ou abstractions pourraient représenter ces comportements ?

3. **Flexibilité et modification dynamique**  
   Est-il possible de changer le comportement d’un canard (par exemple, passer d’un vol avec ailes à un vol impossible)
   sans modifier sa classe ?  
   Comment organiser votre code pour permettre cette flexibilité ?

4. **Avantages de la composition**  
   En quoi la composition d’objets (par exemple, un canard qui possède un objet comportement vol) est-elle préférable à
   l’héritage multiple ou à la duplication de code ?  
   Quels bénéfices cela apporte-t-il en termes de maintenabilité et d’extensibilité ?

5. **Tests et évolutions**  
   Comment cette organisation facilite-t-elle les tests unitaires des comportements ?  
   Comment pourriez-vous ajouter facilement un nouveau type de comportement sans impacter les autres parties du code ?

---

## Travail attendu

- Proposez une structure de classes et interfaces qui sépare clairement les comportements des canards.
- Expliquez comment vous permettriez de modifier ces comportements à l’exécution.
- Donnez des exemples concrets de comportements différents et comment ils s’intègrent dans votre modèle.
- Discutez des avantages et inconvénients de votre approche.

---

## Ressources complémentaires

- Chapitres sur le pattern Stratégie dans *Design Patterns Tête la Première* (Eric Freeman & Elisabeth Freeman).
- Documentation sur les principes SOLID et la composition d’objets.
- Exemples de design patterns orientés comportement.

---

Ce TP vous invite à réfléchir avant de coder, à concevoir une architecture souple et à comprendre les principes
fondamentaux qui rendent un logiciel évolutif et robuste.

---
