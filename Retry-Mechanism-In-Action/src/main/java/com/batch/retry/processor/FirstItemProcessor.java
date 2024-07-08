package com.batch.retry.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.batch.retry.model.StudentCsv;
import com.batch.retry.model.StudentJdbc;
import com.batch.retry.model.StudentJson;

@Component
public class FirstItemProcessor implements ItemProcessor<StudentCsv, StudentJson> {

	@Override
	public StudentJson process(StudentCsv item) throws Exception {
		
		if(item.getId() == 6) {
			System.out.println("Inside Item Processor");
			throw new NullPointerException();
		}
		
		StudentJson studentJson = new StudentJson();
		studentJson.setId(item.getId());
		studentJson.setFirstName(item.getFirstName());
		studentJson.setLastName(item.getLastName());
		studentJson.setEmail(item.getEmail());
		
		return studentJson;
	}

}
