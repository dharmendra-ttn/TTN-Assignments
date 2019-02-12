(function(){

var list_employees=[
];

while(true){

	emp_name = prompt("Enter Name: ");
	emp_age = prompt("Enter Age: ");
	emp_salary = prompt("Enter Salary: ");
	emp_DOB = prompt("Enter DOB: ");

	list_employees.push({Name : emp_name, Age : emp_age, Salary : emp_salary, DOB : emp_DOB});

	var flag = confirm("Do you add more entries: ");
	if(flag == true){
		continue;
	}else{
		break;
	}
}

document.write("<b>filter all employees with salary greater than 5000 : </b><br>");

for(i=0; i<list_employees.length;i++){
	if(list_employees[i].Salary > 5000){
		document.write("Name : " + list_employees[i].Name + "<br>");
	}
}

document.write("<b>group employee on the basis of their age : </b><br>");


document.write("<b>Age Group (less than or equal to 20) : </b><br>");
for(i=0; i<list_employees.length;i++){
	if(list_employees[i].Age <= 20){
		document.write("Name : " + list_employees[i].Name + "<br>");
	}
}
document.write("<br>");
document.write("<b>Age Group (21 - 40) : </b><br>");
for(i=0; i<list_employees.length;i++){
	if((list_employees[i].Age > 20) && (list_employees[i].Age <=40)){
		document.write("Name : " + list_employees[i].Name + "<br>");

	}
}
document.write("<br>");
document.write("<b>Age Group (41 - 60) : </b><br>");
for(i=0; i<list_employees.length;i++){
	if((list_employees[i].Age > 40) && (list_employees[i].Age <=60)){
		document.write("Name : " + list_employees[i].Name + "<br>");

	}
}
document.write("<br>");
document.write("<b>Age Group (others) : </b><br>");
for(i=0; i<list_employees.length;i++){
	if(list_employees[i].Age > 60){
		document.write("Name : " + list_employees[i].Name + "<br>");

	}
}
document.write("<br>");
document.write("<b>fetch employees with salary less than 1000 and age greater than 20. Then give them an increment 5 times their salary</b><br>");
for(i=0; i<list_employees.length;i++){
	if((list_employees[i].Age > 20) && (list_employees[i].Salary < 1000)){
		document.write("Name : " + list_employees[i].Name + "<br>");
		document.write("Old Salary: " + list_employees[i].Salary + "<br>");
		list_employees[i].Salary = +list_employees[i].Salary + +(list_employees[i].Salary * 5);
		document.write("Updated Salary: " + list_employees[i].Salary+ "<br>");
	}
}




}());