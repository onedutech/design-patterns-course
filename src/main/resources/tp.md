## TP Design Patterns

Gestion d'un système de commandes dans un restaurant

---

### Contexte

L'objectif est de modéliser un système où un client peut composer une commande personnalisée (ex : burger avec
ingrédients au choix), gérer la préparation, et permettre des extensions faciles (ajout d'options, variantes, etc.).

---

### Objectifs pédagogiques

- Mettre en œuvre plusieurs design patterns dans un même projet.
- Comprendre les interactions entre patterns créateurs, structurels et comportementaux.
- Appliquer les patterns pour résoudre des problèmes concrets liés à la création, composition et gestion d'objets
  complexes.

---

### Patterns à traiter

- **Builder** : Pour la construction progressive d'objets complexes (ex : création d'un burger avec options).
- **Factory Method / Abstract Factory** : Pour la création de familles d'objets (ex : différents types de pains,
  viandes, sauces).
- **Decorator** : Pour ajouter dynamiquement des fonctionnalités ou options à une commande (ex : ajout de garnitures,
  sauces, emballages spéciaux).
- **Singleton** : Pour gérer une instance unique du gestionnaire de commandes ou du restaurant.
- **Strategy** : Pour définir différentes stratégies de préparation ou de livraison (ex : livraison standard, express,
  retrait sur place).
- **Observer** : Pour notifier les différents acteurs (cuisinier, livreur, client) des changements d'état de la
  commande.

---

### Description succincte du TP

1. **Création des composants de la commande**  
   Utiliser un **Builder** pour permettre au client de composer son burger en choisissant le pain, la viande, les
   légumes, sauces, etc. Le Builder facilite la construction d'objets avec de nombreuses options.

2. **Fabrication des ingrédients**  
   Implémenter une **Factory Method** ou une **Abstract Factory** pour instancier les différents types d'ingrédients (
   pains, viandes, légumes) selon la famille choisie (ex : ingrédients classiques, bio, vegan).

3. **Ajout dynamique d'options**  
   Utiliser le **Decorator** pour ajouter des fonctionnalités supplémentaires à la commande, comme des sauces spéciales,
   emballages, ou options de personnalisation sans modifier les classes de base.

4. **Gestion centralisée**  
   Le gestionnaire de commandes (restaurant) est un **Singleton** garantissant une instance unique qui coordonne la
   prise de commande, la préparation et la livraison.

5. **Stratégies de livraison**  
   Implémenter différentes stratégies de livraison avec le pattern **Strategy**, permettant de changer facilement la
   méthode de livraison sans modifier le code client.

6. **Notification des états**  
   Utiliser le pattern **Observer** pour que les acteurs (client, cuisinier, livreur) soient informés des changements
   d'état de la commande (ex : commande prête, en cours de livraison).

---

## Exemple d'exercice concret

- Le client compose un burger via un Builder.
- Le système utilise une Factory pour créer les ingrédients selon le type choisi.
- Des décorateurs sont appliqués pour ajouter des sauces ou emballages.
- Le gestionnaire Singleton reçoit la commande et lance la préparation.
- Une stratégie de livraison est choisie (express, standard).
- Les observateurs (client, livreur) sont notifiés des étapes.

---