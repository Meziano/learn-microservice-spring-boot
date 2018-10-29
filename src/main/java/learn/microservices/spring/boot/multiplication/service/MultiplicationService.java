package learn.microservices.spring.boot.multiplication.service;

import learn.microservices.spring.boot.multiplication.domain.Multiplication;

public interface MultiplicationService {
	
	/**
	* Creates a Multiplication object with two randomly-generated
	factors
	* between 11 and 99.
	*
	* @return a Multiplication object with random factors
	*/
	Multiplication createRandomMultiplication();

}
