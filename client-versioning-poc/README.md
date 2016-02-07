-- Introduction
Basic project that executes a groovy script to perform a request to the ws service that exposes Address information.
The purpose is to demonstrate that it can be used with a previous version compatible with an updated one.

-- Usage example
$ gradle clean runScript -q -Pidentifier="FN 10"

-- Response exampleOA
GetPerson --- using [FN 10] as request parameter

	Person data:
	FirstName: FN 10
	lasttName: LN 10
	id: 10000010a

-- Parameter
The parameter used can be identifier which can be one of:
* FN n   
* SN n
* 10000000 + n + 'a' // example 10000001a
// being n a number between 1 and 100
