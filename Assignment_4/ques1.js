(function(){

	amount = prompt('Enter Amount: ');
	rate = prompt('Enter Interest Rate: ');
	years = prompt('Enter Years: ');

	sinterest = (amount * rate * years)/100;

	document.write("<b>Simple Interest: </b>" + sinterest);

}());