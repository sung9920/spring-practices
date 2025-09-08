package com.bit2025.emaillist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit2025.emaillist.repository.EmailRepository;
import com.bit2025.emaillist.repository.EmaillogRepository;
import com.bit2025.emaillist.vo.EmailVo;

@Service
public class EmaillistService {
	@Autowired
	private EmailRepository emailRepository;

	@Autowired
	private EmaillogRepository emaillogRepository;

	public List<EmailVo> getEmails() {
		return emailRepository.findAll();
	}

	public void addEmail(EmailVo emailVo) {
		int count = emaillogRepository.update();
		if(count == 0) {
			emaillogRepository.insert();
		}
		
		emailRepository.insert(emailVo);
	}

	public void deleteEmail(Long id) {
		EmailVo vo = emailRepository.findById(id);
		emailRepository.deleteById(id);
		emaillogRepository.update(vo.getRegDate());
	}
}
