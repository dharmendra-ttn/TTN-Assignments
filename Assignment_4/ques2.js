(function(){

	input_string = prompt('Enter String: ');
	string_array = input_string.split("");
	count = 0;

	for(i=0;i<string_array.length;i++){

		if(string_array[i] == string_array[(string_array.length-1)-i]){
			count++;
		}

	}

	if(count == string_array.length){
		document.write(input_string + "<b> is palindrome </b>");
	}else{
		document.write(input_string + "<b> is not palindrome </b>");

	}

}());