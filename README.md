# GYM WORK OUT AND TRACKER APPLICATION
# Gym workout and tracker application

This is an application that helps athletes,users of the app perform home workouts and keep track of them.

## Table of Contents

- [Social-App](#Social-App)
    - [Table of Contents](#table-of-contents)
    - [Problem Statement](#problem-statement)
    - [Objectives](#objectives)
    - [Users](#users)
    - [Technologies](#technologies)
    - [REQUIREMENTS SPECIFICATION](#requirements-specification)
        - [Technical Requirements](#technical-requirements)
        - [Non-functional requirements](#non-functional-requirements)
        - [Functional Requirements](#functional-requirements)
            - [Users Module](#users-module)
            - [Notification Module](#notification-module)
    - [Software Design Description](#software-design-description)
    
## Problem Statement

Ideally the application will act as a personal gym assistant were it provides variety of workouts of different level of difficulty and also keep a record when a plan is selected and done with.

## Objectives

The main objective of this project is to create a mobile based gym workout and tracker application. This can broken down into modules:

1. Homepage - This is the screen the user sees the first time the application is fully launched.
2. Insights - To show users there progress as they keep using the application.
3. Gamification - the user's progress is tracked by mountain climbs in a ascending order.


## Users

1. Athletes
2. Employees working from home

## Technologies

The system we build on Android studio with the following technologies

- Java 
- Room
- XML 

## REQUIREMENTS SPECIFICATION

### Technical Requirements

Specify the requirements in order to develop or run this application.

### Non-functional requirements

- Data stored locally.
- The system should be light weight and fast to load users data and application files.

### Functional Requirements

#### Users Module

- Start a workout
- Keep track of previous workouts done
- Mountain climb gamification

#### Notification Module

- View notification
- Mark as read

## Software Design Description

### User Interface Design
//
### Database Design

#### Workout Table

- name - This will be the name of the workout
- duration - This is the time estimated to take wile performing a workout 
- date and time - Tracks the date and time a workout was done
- workout image - This will make finding a workout easy to the user
