## Énoncé du TP : Station météo – Pattern Observateur

---

### Contexte

Ce TP s’inspire de l’exemple pédagogique du livre *Design Patterns Tête la Première* d’Eric Freeman et Elisabeth
Freeman. Il s’agit de modéliser une station météo qui collecte des données (température, humidité, pression) et notifie
automatiquement plusieurs affichages lorsque ces données changent.

---

### Objectifs pédagogiques

- Comprendre et appliquer le **pattern Observateur** pour maintenir la synchronisation entre un sujet (la station météo)
  et plusieurs observateurs (affichages).
- Concevoir un système découplé où la station météo ne connaît pas les détails des affichages.
- Gérer la mise à jour automatique des affichages à chaque nouvelle mesure.
- Expérimenter avec différentes formes d’affichage basées sur les mêmes données.

---

### Description du problème

Vous devez concevoir un système comportant :

- Une **station météo** qui recueille des mesures : température, humidité, pression atmosphérique.
- Plusieurs **affichages** qui présentent ces données sous différentes formes, par exemple :
    - Affichage des conditions courantes (température et humidité).
    - Affichage d’une prévision météo basée sur la variation de la pression.
    - Affichage des statistiques (température moyenne, maximale, minimale).

La station météo doit notifier automatiquement tous les affichages enregistrés dès qu’une nouvelle mesure est prise.

---

### Pistes de réflexion

1. **Modélisation du sujet (station météo)**  
   Comment représenter la station météo pour qu’elle puisse gérer une liste d’observateurs ?  
   Comment stocker et mettre à jour les mesures ?  
   Comment déclencher la notification des observateurs à chaque nouvelle donnée ?

2. **Interfaces et abstractions**  
   Quelle interface ou classe abstraite définir pour les observateurs ?  
   Comment garantir que tous les affichages implémentent une méthode de mise à jour ?  
   Comment faire en sorte que la station météo ne soit pas couplée aux types concrets d’affichages ?

3. **Mécanisme de notification**  
   Comment transmettre les données mises à jour aux observateurs ?  
   Faut-il passer les données directement, ou laisser les observateurs interroger la station météo ?  
   Comment gérer la cohérence et la synchronisation ?

4. **Conception des affichages**  
   Comment implémenter les différents affichages pour qu’ils réagissent correctement aux notifications ?  
   Comment calculer et afficher les statistiques (moyenne, max, min) à partir des données reçues ?  
   Comment implémenter la logique de prévision basée sur la pression ?

5. **Extensibilité**  
   Comment ajouter facilement un nouvel affichage sans modifier la station météo ?  
   Comment gérer l’abonnement et le désabonnement des observateurs ?

---

### Travail attendu

- Définir les interfaces/classes pour le sujet et les observateurs.
- Implémenter la station météo avec gestion des observateurs et notification automatique.
- Créer au moins trois types d’affichages différents selon les spécifications.
- Simuler la prise de mesures successives et observer la mise à jour automatique des affichages.
- Documenter vos choix de conception et expliquer comment le pattern Observateur facilite la maintenance et l’évolution
  du système.

---


Ce TP vous permettra de comprendre comment un système peut automatiquement propager des changements d’état à plusieurs
composants indépendants, favorisant ainsi une architecture logicielle souple et modulaire.

---
