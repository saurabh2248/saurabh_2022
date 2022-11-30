class employees{
    constructor(companyName,employeeName, experience, departement, posting, joiningDate, location, empId, salary){
        this.companyName=companyName;
        this.employeeName=employeeName;
        this.experience=experience;
        this.departement=departement;
        this.posting=posting;
        this.joiningDate=joiningDate;
        this.location=location;
        this.empId=empId;
        this.salary=salary;
        
   }
}

class developer extends employees{
    display(){
        console.log(`${this.companyName} ${this.employeeName} ${this.experience} ${this.departement} ${this.posting} ${this.joiningDate} ${this.location} ${this.empId} ${this.salary}`);
    }  
}
class HR extends employees{
    display(){
        console.log(`${this.companyName} ${this.employeeName} ${this.experience} ${this.departement} ${this.posting} ${this.joiningDate} ${this.location} ${this.empId} ${this.salary}`);
    }  
}
class finance extends employees{
    display(){
        console.log(`${this.companyName} ${this.employeeName} ${this.experience} ${this.departement} ${this.posting} ${this.joiningDate} ${this.location} ${this.empId} ${this.salary}`);
    }  
}
class sales extends employees{
    display(){
        console.log(`${this.companyName} ${this.employeeName} ${this.experience} ${this.departement} ${this.posting} ${this.joiningDate} ${this.location} ${this.empId} ${this.salary}`);
    }  
}
class marketing extends employees{
    display(){
        console.log(`${this.companyName} ${this.employeeName} ${this.experience} ${this.departement} ${this.posting} ${this.joiningDate} ${this.location} ${this.empId} ${this.salary}`);
    }  
}
class QA extends employees{
    display(){
        console.log(`${this.companyName} ${this.employeeName} ${this.experience} ${this.departement} ${this.posting} ${this.joiningDate} ${this.location} ${this.empId} ${this.salary}`);
    }  
}

let C1= new developer("Cognizant", "Saurabh", "",3,"IT", "Karnatak","18-NOV-2020", "Bangalor",234567, 20000);
C1.display();
let C2= new HR ("TCS", "Manish", "",3,"HR", "Karnatak","18-NOV-2020", "Bangalor",234567, 20000);
C2.display();
let C3= new finance("JPMorgan", "Kunal", "",3,"Audit", "Karnatak","18-NOV-2020", "Bangalor",234567, 20000);
C3.display();
let C4= new sales("AXIS", "Nishant", "",3,"Sales", "Karnatak","18-NOV-2020", "Bangalor",234567, 20000);
C4.display();
let C5= new marketing("Birla", "Somya", "",3,"Marketing", "Karnatak","18-NOV-2020", "Bangalor",234567, 20000);
C5.display();
let C6= new QA("IBM", "Anjali", "",3,"IT", "Karnatak","18-NOV-2020", "Bangalor",234567, 20000);
C6.display();

