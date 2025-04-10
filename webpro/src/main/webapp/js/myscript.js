/**
 * 
 */


function calc() {
	//x, y요소 검색
	
	xValue = parseInt(document.getElementById('x').value);
	yValue = document.getElementById('y').value;
	
	add = xValue + yValue;
	sub = xValue - yValue;
	mul = xValue * yValue;
	div = xValue / yValue;
	
	//출력내용
	str = `x : ${xValue} y : ${yValue}<br>
		   add : ${add}<br>
		   sub : ${sub}<br>
		   mul : ${mul.toLocaleString()}<br>
		   div : ${div.toFixed(2)}<br>
		  `
	
	//출력
	
	document.getElementById('result').innerHTML = str;
}