# OOP Project Group 10 Final Report

---
### Group Members
student number - name<br />
4823567 - Himanshu Pathak<br />
4974042 - IJsbrand Slagmolen<br />
4953770 - Michael Chan<br />
4840488 - Nima Khaksar<br />
4884663 - Oliver Neut<br />
4996961 - Rauf Akdemir<br />
4952936 - Tamer Sahin<br />

---
## General project flow
1. Did we manage to stick to the planning?<br />
    Overall: yes. Each sprint taken separately: there have been weeks where we didn't finish all the tickets for that week. Usually because tickets had become obsolete due to redundancy.
2. How did our team collaboration go?<br />
    We divided the team in sub-teams. All in all this went well. Each sub-team did their share.
3. How did we communicate?<br />
    We agreed whatsapp would be our main communication channel. In addition we used gitlab and MatterMost. The main part of communication in the team happened during the face to face meetings where we also did the sprint plannings. Whatsapp then provided supplementary communication.
    If a sprint planning didn't work out, this would be discussed in the whatsapp group and work would be redistributed there. If necessary or desirable, additional face to face meetings would be planned, as face to face talking proved to be the most effective way of communicating.
4. How did version control help?<br />
    We were able to make branches per week and add features accordingly. This was a great help with regard to keeping documentation and keeping things organized.
5. What did we learn?<br />
    We all learned how to work properly in group and what it is like working on software in team.
    Most of us learned how to work with git because we weren't used to it yet. And all of us got to know a few helpful frameworks like Spring, maven, mockito.

---
## Design Decisions
1. What major design decisions did we take as a team?<br />
    First of all we were going to finish the minimum viable product and then add bonus features.
2. Which technological choices did we make and why?<br />
    Regarding the GUI: we decided on NetBeans as this seemed to be a smart way to build the GUI. Later we switched to SceneBuilder, as this was more suited for displaying graphs. (Had we known in advance graphs we're to be a feature we would've decided on SceneBuilder from the start.)
    We chose to not have an abstract base class because we found an enumerator to be more useful. It saves on the number of classes and thus the amount of testing to do. (A downside of using an enumerator is that all activity objects have the same attributes, therefore we cannot use different units like square meter/kilometer/mass.)
    We used SQL over NOSQL since it makes querying easier and the result of a query is easier to model on objects. Also, everyone in our team had more experience with SQL than NOSQL.
3. What system did we use to calculate the CO2 savings?<br />
    We looked up good and correct values for each mandatory activity we needed to implement, and we decided to store them into our database. This was much better because we didn't think the coolclimate API (which we had in mind at first) was a good solution for our application.   

---
## Points for improvement
1. How can our software be improved?<br />
    We could add more bonus features which would give us a higher grade like :<br />
        - make it into an android application.<br />
        - add a visual representation of a forest where the user can see how much trees he saved<br />
        - add a API which can calculate CO2 for the car you drive (BMW X5, Volvo C3, ...)<br />
2. How can the process/collaboration be improved?<br />
    We could split up the workload even more, so that everyone has done an equal share into the making of the application. Or maybe we could have changed everyone's task on a weekly basis, this way everyone would have worked on every aspect of the application.
3. How can the course be improved?<br />
    Give the students an intro on maven and mockito. Some things we're hard to process on your own.
    We know that the course is about looking things up and learning things on the go without much help, but sometimes an introduction on complex subjects would be really helpful. Also, if realistically possible, make the course longer. After 8 weeks, several team members felt that the real collaboration had only just begun and could have been pushed further.

---
## Individual feedback

### Himanshu Pathak
My role in the project was to work on the server side and handle the database for storing the data. I worked extensively in making the api endpoint handling on the server side, the database schemas and most of the queries that were used to retrieve and store data within the database. I also spent a lot of time in researching in mockito in order to figure out how it can be used to test the server side code that I had created.

My strong points for the project was my proficiency with programming and basic knowledge of how database and server systems can be connected together. My weaker points and my goal for this project was to learn how to efficiently work in a group and delegate tasks based on the strong points and weak points of the members. I have learned a lot about this, however I would like to improve more in this area.

As per conflicts with team members, there were none, however there were at some point conflict of ideas on how to develop x/y feature and these conflicts were solved by making decision between the whole group based on what will be easier to program, be logical for the end user etc. 
### IJsbrand Slagmolen
My stronger points were that I already have experience working from vague assignments to concrete goals, since I'd used to work in a corporate environment (and in corporate life assignments are usually vague).
Therefore I feel like I had a good idea how to start on this project (gather information given and take the first steps from there). Furthermore I see the necessity of doing the administration that comes with good teamwork and therefore I kept watch over our SCRUM-board hygiene and meeting notes.
My weaker points were that I might've been more proactive at times during the sprint plannings. I'm a mediocre coder and wanted to learn better coding but ended up doing more organizational activities.
### Michael Chan
During this project I worked a lot on the client side code and also did some server side code. Because of this I knew the code from both the client and server side quite well and I was able to help the GUI to design frames that were compatible with our server and did a lot of the client side data processing as well as requesting data from the server.
My stronger points were that I had a pretty good understanding of the program in general and I was able to help out others when they had to go outside their field of expertise.
My weaker points were that I did not keep track the organisational activities well such as the SCRUMBoard. I also ended up doing most of my work in the weekend before the demo which was not very helpful for the rest of the team as it would seem if we were behind schedule.
This was especially an issue for the week 8 deadline as we ended up with untested code and it was not clear who was going to write those tests. I ended up writing them the night before the demo. Better planning would have avoided that issue altogether and is something I will keep in mind for in the future.
### Nima Khaksar
I was responsible for the client side, with other words to build and develop the GUI and its features. 
There was another member who also had the same responsibility with the GUI, however since he didn't have previous experience with it, 
I was his helping hand in the first beginning until he managed to pull it off and started to work with it alongside with me. 
My stronger points with the project are that I have always done the necessary tasks before the deadline or on-time,
with other words no previous left overs and I have also worked with a backup plan simultaneously as with the "current plan" 
so if something goes wrong with the first plan, then I do have a backup to show/work with. 
My weak points are that I didn’t understand very well of how Git and Sourcetree work, which led to several problems when I tried
to commit my work/code.   
### Oliver Neut
In the beginning of the project I was very interested in making an application in team, it seemed very hard to begin. But after the first week of coding we got the first demo done, this wasn't really a struggle. After that thinks got more complicated, we started using frameworks like Spring and mockito. I couldn't figure out how to work with it and just helped where I could, I did the checkstyle for a bit of classes. In week 6 I started with defining a scoring system that we could implement into the database of our application. The week after I looked into encrypting the passwords of the user, this worked out really good. Week 8 I implemented an achievement tab into our application, where the user can see how good he is performing. I learned quite a few things during this project and these will definitely be good in the future.

### Rauf Akdemir
At the beginning I was a bit disoriented as to what had to be done, so I quickly grabbed the marker and we figured things out on how it should look like on a bigger scale. After that meeting I thought I would have a stronger role than I eventually had. Because there was no clearly defined task for me, I found myself being disoriented between the parts of the team that actually focused on a particular thing. Git was also new to me and that has been quite a learning experience, because I now really start to understand how software projects are implemented in a big team. I ended up working on client-server-DB communication with Himanshu and Michael, but I wish I would have had my hands a bit more dirty. Working in a team was really good to me, and I think most of us experienced that in a way. I kind of wish there was more to do, because I think we could have pushed our team work a bit further. We just started really.
### Tamer Sahin
At the beginning of the project everything was a little bit vague for me. Then meeting after meeting, things became clearer. I think my strong points during the project were that I was very critical of the small points in the rubric and tried to make sure everyone did it that way.
I also think that my communication with the group was also a plus, especially with the one with whom I made the GUI, Nima.
My weakness was certainly the entire process with Sourcetree and working with git.
It was the second OOPP lecture that we got an explanation about Github and I already knew that it would be difficult to master. Of course, for example, pushing code became no problem after pushing several times , but I must admit that I still have problems with Git and certain things from Sourcetree, but I got the motivation to try to master this after the OOPP course.
The last one, which I can't actually call a weakness, but rather something that I regret is that during the project I only worked on one thing, the GUI. The good thing about this is that I started at 0, no  experience, but now I manage it.
It would have been better if I had also done something with the server. That is why I am very happy with OOPP, because I am not going to make the mistakes I made this year during the final period next year!

---
## Value Sensitive Design
### Main concept, stakeholders and values
Our main concept is that we design an app for people wishing to improve their environmental impact.
    In general terms the design stakeholders would be the students working on the app, the TA's and teachers determining the grade and the end users that might use the app.
    The values in general terms would be sustainability (lessen environmental impact), environmental-friendliness (eat less meat, drive the car less) and privacy (keep the user's data safe).
### Non-obvious stakeholders/values
A non-obvious stakeholder would be meat production companies looking for vegetarian alternatives. In the event of a great overwhelming success of our app, making everyone eat more vegetarian meals all over the world (for one thing), a vegetarian diet would become much more mainstream. Vegetarian meat alternatives become more economically viable.
    An non-obvious value in our project is well-being with regard to diet. With regard to the environment we would ideally all follow a vegetarian diet. However, even if we would all eat a vegetarian diet, the retention of meat-like foods in our diet might be a good thing, as this is a type of food a lot of people greatly enjoy worldwide. With our app we encourage people to eat vegetarian meals, but we should also encourage them to follow a varied diet and to enjoy what they eat.
### Consequences for design
What would happen if we were to alter our design taking the above non-obvious stakeholder and value into consideration?
    For the non-obvious stakeholder (a meat production company looking into vegetarian alternatives) we would try and gather data on how many people are actually changing their diet and are eating more vegetarian meals than before. We would recruit meat production companies for a newsletter and send them info on milestones reached. The students building the app might have the benefit of financial gain, as will the companies getting data on how to invest in future products. The user might not want to share his data. There will be tension between selling data and giving the user his/her privacy.
    For the non-obvious value we could put in more features where people can judge in how far they enjoyed their meal and how the absence/addition of meat-like products improved enjoyment.
### Required knowledge for adequate design alterations
The next question is: what knowledge do we need to realize the above design alterations? What people would we interview, what research would need to be done and in which fields of science?
    For the environmental-friendliness we want to inform ourselves about what non-vegan foods exactly are the most harming to our planet. Finding alternatives to these kinds of products is best done by informing ourselves by food-experts.
    We also would want to keep a varied diet for the consumer, we would have to delve deeper into what the importance of meat is and also how much a person actually needs it in his/her diet. We think studies about diet/health concerning vegan lifestyles should learn us that. A last thing that would be important is to popularize the concept of a vegan lifestyle as much as possible, experts on consumer behaviour would be best at teaching us the best ways to do so.
### Tension between stakeholders
Different stakeholders will have different interests. In our case: the meat companies will have different interests than the users of the app. There will be tension between selling data to food producing companies and giving the user his/her privacy that he/she needs.
    In what ways could this tension be eased? We would take the data we gather from the users into account and form general graphs about their behaviour. The private data e.g. Lisa has eaten only vegan meals last week wouldn't be the data we would actually want to give away. Only if the user agrees to do so. This way the users that agree shouldn't be angry and the users who don't still have their privacy. While at the same time the companies can benefit from the data we gather.