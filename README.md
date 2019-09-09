# TDT4250_Modeling

This repository is for assignment 1 in the NTNU course TDT4250 Advanced software design.

Group: Hallvard Echtermeyer, Henrik Knudsen

## Structure

### Model

--> UniversityStudies.ecore:

  - Ecore model for the assignment.
  
--> UniversityStudies.genmodel

  - Genmodel for the assignment, generating code based on ecore model.
  
### src
  - Contains interfaces representing the classes, given by the ecore model.
  
--> Utils

  - Adapter factory and validator, used for the constraints of the model
  
--> Impls
  
  - Concrete implementations of the interfaces in the src folder.

## Content

--> Studyplan

  - Represents what is shown to a student when visiting studentWeb. Includes a Programme, potential specializations, semesters and results from exams.
  
--> Programme

  - Represents a study programme, ex. MTDT. Incudes a set of allowed courses and potential specializations. The programme also has a name, a type (2 year master, 5 year master, bachelor, one-year-study etc) and a year field, signifying what the expected duration of the programme will be.
  
  

