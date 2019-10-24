# TDT4250_Modeling

This repository is for assignment 1 in the NTNU course TDT4250 Advanced software design.

Group: Hallvard Echtermeyer, Henrik Knudsen

## Structure

### Model

### UniversityStudies.ecore:

  - Ecore model for the assignment.
  
### UniversityStudies.genmodel

  - Genmodel for the assignment, generating code based on ecore model.
  
### src
  - Contains interfaces representing the classes, given by the ecore model.
  
### Utils

  - Adapter factory and validator, used for the constraints of the model
  
### Impls
  
  - Concrete implementations of the interfaces in the src folder.

## Content

### Department

  - Represents a university department. Container for a set of courses and programmes. Main entity in model.
  
### Programme

  - Represents a study programme, ex. MTDT. Incudes a set of semesters and potential specializations. The programme also has a name, a type (2 year master, 5 year master, bachelor, one-year-study etc) and a numberOfSemesters field, signifying what the expected duration of the programme will be. The programme is containted by the department, and has a container reference to it.
  
### Specialization

  - Represents a specialization a student can take during their Programme. A Programme might have no, single or multiple levels of specializations (ex. in MTDT you can choose to specialize in only AI, or choose softwaresystems in the 3rd year and then software development in 4th year). A specialization has a set of semesters related to it, and can potentially have further specializations.
  
### Course

  - Represents a generic course taken at NTNU. Each course has a code (ex. TDT4250) and a name (ex. Advanced software design). Each course awards a certains set of credits on completion (between 5 and 30 points), and is potentially connected to one or more Semesters (students of that programme are then allowed to take the course).
  
### Semester

  - Represents a semester, part of a programme or specialization. Contains a set of course slots, which can be manditory or elective. Has a constraint that each semesters selected courses has to sum up to 30 or more credits.

### CourseSlot

- Superclass for ManditoryCourseSlot and ElectiveCourseSlot. Contains a course, selected for the slot.

### ElectiveCourseSlot

- Courseslot, where the student would be able to select a course among a set of courses. Contains the list of potential coruses.

### ManditoryCourseSlot

- CourseSlot, with only one allowed (manditory) course.
  
