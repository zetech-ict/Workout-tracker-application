# GYM WORK OUT AND TRACKER APPLICATION
# Social-App

This is an application that helps students And lecturers to interact and make new friends.

## Table of Contents

- [Social-App](#Social-App)
    - [Table of Contents](#table-of-contents)
    - [Problem Statement](#problem-statement)
    - [Objectives](#objectives)
    - [Users](#users)
    - [Technologies](#technologies)
    - [Contributing Guide](#contributing-guide)
    - [REQUIREMENTS SPECIFICATION](#requirements-specification)
        - [Technical Requirements](#technical-requirements)
        - [Non-functional requirements](#non-functional-requirements)
        - [Functional Requirements](#functional-requirements)
            - [Users Module](#users-module)
            - [Notification Module](#notification-module)
            - [Article management Module](#article-management-module)
            - [Clubs/Societies Module](#clubssocieties-module)
            - [Student News and Announcements](#student-news-and-announcements)
    - [Software Design Description](#software-design-description)
        - [User Interface Design](#user-interface-design)
            - [Landing Page](#landing-page)
            - [Dashboard](#dashboard)
            - [Login Page](#login-page)
            - [Registration Page](#registration-page)
            - [News and Announcements](#news-and-announcements)
            - [Comment Modal](#comment-modal)
            - [Share Modal](#share-modal)
            - [Create Event Page](#create-event-page)
## Problem Statement

Ideally students should be able to communicate with their peers and also lecturers. Student should be able to give feedback to their peers and lectures. Currently students access information through e-learning portal, school emails and student to student means. Some students may not have scool emails and maaybe they don't access anyone's contact, making it abit hard to acquire information. student to student communication may end up in distortiion of infromation. This project proposes created of a mobile based application to centralize access information.

## Objectives

The main objective of this project is to create a mobile based social application. This can broken down into:

1. To create a users management module that will allow registration of new users,login and profile management.
2. To create an article management system that will allow creation of posts, viewing, likes and comments.
3. To create an event management module that will allow creation of new events, notification and archiving of due events.


## Users

1. campus students
2. campus staff
3. System administrators/moderators.

## Technologies

The system we build on Android studio with the following technologies

- Java - firebase
- javascript

## REQUIREMENTS SPECIFICATION

### Technical Requirements

Specify the requirements in order to develop or run this application.

### Non-functional requirements

- Data Encryption.
- The system should be light weight for ease of access and should within two seconds.

### Functional Requirements

#### Users Module

- Registration
- login
- Password reset
- verify email
- profile update

#### Notification Module

- create new notification
- View notification
- Mark as read

#### Feeds

- Upload
- edit photos/videos
- delete post
- view posts
- like post
- comment post

## Software Design Description

### User Interface Design

#### Login Page

![login](https://user-images.githubusercontent.com/91112835/155322073-ab422430-02e7-47b5-b0a3-5ea13b9a7f05.png)

#### signup Page
![signup](https://user-images.githubusercontent.com/91112835/155322154-10ce9e12-ad8c-433f-b82d-59b2ec16b143.png)

#### Feeds

![homepage](https://user-images.githubusercontent.com/91112835/155322205-ab7c0829-ffea-45d8-b60d-c2258223a13b.png)


### Database Design

#### Users Table

- Id - This will be auto increment which will the unique identifier for the user
- email - This will be a school email
- first name - User given first name
- second name - user given second name
- gender - This should be male, female or other
- password - should be atleast 8 characters
- mobile - should be atleast 10 numbers
- Date registered - identifies when the user registered
- last login - identifies whe the user last loged in
- introduction - user's profile details


#### User friends/follower Table

- id
- source_id
- target_id
- type
- status
- created
- updated
- notes

#### User messsage table

A record in this table stores:

- message_id
- sender_id
- reciever_id
- time sent
- time recieved

#### User posts table

A record in this table will store:

- post_id
- user_id
- sender_id
- message
- time created
