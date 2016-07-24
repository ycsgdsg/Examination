CREATE DATABASE IF NOT EXISTS EXAMINATION;
USE EXAMINATION;

drop table if exists Examination.participant;
CREATE  TABLE `examination`.`participant` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `id_number` BIGINT NOT NULL ,
  `name` VARCHAR(45) NULL ,
  `question_id` BIGINT NULL ,
  `answer_id` BIGINT NULL ,
  PRIMARY KEY (`id`) );

drop table if exists Examination.question;
CREATE TABLE Examination.question (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(10240) NULL ,
  `answer_template` VARCHAR(10240) NULL ,
  PRIMARY KEY (`id`) );

drop table if exists Examination.answer;
CREATE TABLE Examination.answer (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `answer` VARCHAR(10240) NOT NULL,
  PRIMARY KEY (`id`) );
