(function(){

var object1 ={
	name:'Dharmendra',
	designation:'Trainee',
	competency: 'JVM'
};

var object2 = Object.create(null);

for(var key in object1){
	object2[key] = object1[key];
	console.log(key + " and " + object1[key] + " copied to object2");
}

document.write("<b>Values in the both objects after copying</b><br>");

document.write("<b>Object1 : </b><br>");

for(var key in object1){
	document.write(key + " : " + object1[key] + "</br>");
}

document.write("<b>Object2 : </b><br>");
for(var key in object2){
	document.write(key + " : " + object2[key] + "</br>");

}

}());