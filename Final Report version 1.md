# OOP Project Group 10 Final Report

---
### Group Members
student number - name
4823567 - Himanshu Pathak
4974042 - IJsbrand Slagmolen
4953770 - Michael Chan
4840488 - Nima Khaksar
4884663 - Oliver Neut
4996961 - Rauf Akdemir
4952936 - Tamer Sahin

---
## How did the project go?
1. Did we manage to stick to the planning?
    Overall: yes. Each sprint taken separately: there have been weeks where we didn't finish all the tickets for that week. Usually because tickets had become obsolete due to redundancy.
2. How did our team collaboration go?
    We divided the team in sub-teams. All in all this went well. Each sub-team did their share.
3. How did we communicate?
    We agreed whatsapp would be our main communication channel. In addition we used gitlab and MatterMost. The main part of communication in the team happened during the face to face meetings where we also did the sprint plannings. Whatsapp then provided supplementary communication.
    If a sprint planning didn't work out, this would be discussed in the whatsapp group and work would be redistributed there. If necessary or desirable, additional face to face meetings would be planned, as face to face talking proved to be the most effective way of communicating.
4. How did version control help (if at all)?
    We were able to make branches per week and add features accordingly. This was a great help with regard to keeping documentation and keeping things organized.
5. What did we learn?
    We all learned how to work properly in group and what it is like working on software in team.
    Most of us learned how to work with git because we weren't used to it yet. And all of us got to know a few helpful frameworks like Spring, maven, mockito.
6. […] (← other points to add?)

---
## Design Decisions
1. What major design decisions did we take as a team?
    First of all we were going to finish the minimum viable product and then add bonus features.
2. Which technological choices did we make and why? (e.g. Swing versus JavaFX, yes/no abstract base class, ...)
    Regarding the GUI: we decided on NetBeans as this seemed to be a smart way to build the GUI. Later we switched to SceneBuilder, as this was more suited for displaying graphs. (Had we known in advance graphs we're to be a feature we would've decided on SceneBuilder from the start.)
    We chose to not have an abstract base class because we found an enumerator to be more useful. It saves on the number of classes and thus the amount of testing to do. (A downside of using an enumerator is that all activity objects have the same attributes, therefore we cannot use different units like square meter/kilometer/mass.)
    We used SQL over NOSQL since it makes querying easier and the result of a query is easier to model on objects. Also, everyone in our team had more experience with SQL than NOSQL.
3. What system did we use to calculate the CO2 savings?
    We looked up good and correct values for each mandatory activity we needed to implement, and we decided to store them into our database. This was much better because we didn't think the coolclimate API (which we had in mind at first) was a good solution for our application.   
[…] (← other points to add?)

---
## Points for improvement
1. How can your software be improved (testing, GUI, code quality, features, ...)
    We can add more bonus features which would give us a higher grade like :
        - make it into an android application. 
        - add a visual representation of a forest where the user can see how much trees he saved
        - add a API which can calculate CO2 for the car you drive (BMW X5, Volvo C3, ...)
2. How can the process/collaboration be improved?
    We could split up the workload even more, so that everyone has done an equal share into the making of the application. Or maybe we could have changed everyone's task on a weekly basis, this way everyone would have worked on every aspect of the application.
3. How can the course be improved?
    Give the students an intro on maven, mockito ... Some things we're hard to process on your own.
    We know that the course is about looking things up and learning things on the go without much help, but sometimes an introduction on complex subjects would be really helpful.
4. […] (← other points to add?)

---
## Individual feedback
1. Everyone writes at least 200 words on how they functioned in the team:
    I) what were your stronger/weaker points during the project?
    II) Did you have conflicts with team members? How did you solve them?
### Himanshu Pathak
### IJsbrand Slagmolen
My stronger points were that I already have experience working from vague assignments to concrete goals, since I'd used to work in a corporate environment (and in corporate life assignments are usually vague).
Therefore I feel like I had a good idea how to start on this project (gather information given and take the first steps from there). Furthermore I see the necessity of doing the administration that comes with good teamwork and therefore I kept watch over our SCRUM-board hygiene and meeting notes.
My weaker points were that I might've been more proactive at times during the sprint plannings. I'm a mediocre coder and wanted to learn better coding but ended up doing more organizational activities.
### Michael Chan
### Nima Khaksar
### Oliver Neut
In the beginning of the project I was very interested in making an application in team, it seemed very hard to begin. But after the first week of coding we got the first demo done, this wansn't really a struggle. After that thinks got more complicated, we started using frameworks like Spring and mockito. I couldn't figure out how to work with it and just helped where I could, I did the checkstyle for a bit of classes. In week 6 I started with defining a scoring system that we could implement into the database of our application. The week after I looked into encrypting the passwords of the user, this worked out really good. Week 8 I implemented an achievement tab into our application, where the user can see how good he is performing. I learned quite a few things during this project and these will definitely be good in the future.
### Rauf Akdemir
### Tamer Sahin

---
## Value Sensitive Design
(500-750 words) 
1. Identify an unusual stakeholder and an unusual value in your project
    An unusual stakeholder in our project would be the generation born at the end of the 21 century. Their world might be very different due to climate change.
    An unusual value in our project might be
2. How would our design be different if we were to really take above stakeholder and value into consideration?
    For the stakeholder: figure out how our app could really change behaviour and reduce climate change to a minimum. In addition: we could make an achievement system that measures the difference you made to a person to be born at the end of the 21 century.
3. What knowledge would we really need to do point 2? (What people would we interview, what research would need to be done and in which fields of science?)
    We would need to know what difference we could make for the end of the 21 century. We'd need information on how fast the climate is changing, what the real effects of this will be in about 80 years and how our app will reduce these effects. We'd need information also on how usage of an app can influence behaviour and how to make use of this. Ideally a renowned social scientist/psychologist would do research on apps like pokémon go and how it influences behaviour and share his/her results with us.
4. Describe one OR the other: what tension exists between the values of this project? OR: What tension exists between the stakeholders of this project?