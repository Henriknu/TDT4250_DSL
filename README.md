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
  
--> Specialization

  - Represents a specialization a student can take during their Programme. A Programme might have no, single or multiple levels of specializations (ex. in MTDT you can choose to specialize in only AI, or choose softwaresystems in the 3rd year and then software development in 4th year). A specialization might unlock new courses, not avaible before, while also unlockig further specializations.
  
--> Course

  - Represents a generic course taken at NTNU. Each course has a prefix (ex. TDT), a code (ex. 4250) and a name (ex. Advanced software design). Each course awards a certains set of credits on completion (between 5 and 60 points), and is potentially connected to one or more Programmes (students of that programme are then allowed to take the course).
  
--> Semester

  - Represents a student's semester, containing what courses the student took. Each semester has a prefix (ex. H for "Høst") and a year (ex. 2019). 
  
--> Result

  - Represents a single result, given for a course at the end of a semester. Contains information about grade, date, candidate Nr. Also has pointers to the relevant course, studyplan and semester. 
  
  
  

  
  

