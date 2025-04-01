# Gestion de Stock - Documentation

## Description du Projet

Ce projet est une application de gestion de stock développée avec Spring Boot. Elle permet de gérer des articles, des commandes clients et fournisseurs, ainsi que des ventes.

## Structure du Projet

```
gestiondestock_src/
├── src/
│   ├── main/
│   │   ├── java/com/matqueme/gestiondestock/
│   │   │   ├── controller/      # Contrôleurs REST
│   │   │   ├── dto/             # Objets de transfert de données
│   │   │   ├── services/        # Couche service
│   │   │   └── ...
│   │   └── resources/           # Fichiers de configuration
│   └── test/                    # Tests unitaires et d'intégration
└── pom.xml                      # Configuration Maven
```

## Architecture Spring Boot

### Couches de l'application

1. **Contrôleurs (Controllers)** : Point d'entrée des requêtes HTTP, implémentent les API REST.
2. **Services** : Contiennent la logique métier de l'application.
3. **DTO (Data Transfer Objects)** : Objets utilisés pour transférer des données entre les couches.
4. **Entités** : Représentations des tables en base de données (non visibles dans l'architecture au-dessus).
5. **Repositories** : Interfaces pour l'accès aux données (non visibles dans l'architecture au-dessus).
6. **Modèles** : Représentations des données (non visibles dans l'architecture au-dessus).

### Fonctionnalités principales

- Gestion des articles (CRUD)
- Suivi de l'historique des ventes
- Gestion des commandes clients et fournisseurs
- Gestion des catégories
- Stockage de photos via Flickr

## Technologies utilisées

- **Spring Boot** : Framework Java facilitant le développement d'applications
- **Spring MVC** : Implémentation du pattern MVC pour les applications web
- **Spring Data JPA** : Simplification de l'accès aux données
- **Maven** : Gestion des dépendances et build du projet
- **Service Flickr** : Stockage des images

## Démarrage

Pour lancer l'application, exécutez :

```bash
mvn spring-boot:run
```

## Points d'accès API

L'application expose plusieurs endpoints REST pour manipuler les données, notamment :

- `/articles` : Gestion des articles
- `/categories` : Gestion des catégories
- `/commandes` : Gestion des commandes

Consultez les interfaces API dans le code source pour plus de détails sur les endpoints disponibles. (Pas de swagger)