package control.logon;

import java.sql.Timestamp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.annotation.Resource;
import logon.LogonDBBean;
import logon.LogonDataBean;

@Controller
@RequestMapping( "/logoninput" )
public class LogonInput {
	@Resource
	private LogonDBBean logonDao;
	
	@GetMapping
	public String inputForm() throws Exception {
		return "member/inputForm";
	}
	@PostMapping
	public String inputPro( @ModelAttribute LogonDataBean logonDto, @RequestParam String userId,
			@RequestParam String nickname, @RequestParam String email, @RequestParam String emailVerified, Model model ) throws Exception {
		
		logonDto.setEmail( email );
		 int checkid = logonDao.check(userId);
		 int checknickname = logonDao.checkNickname(nickname);
		    if (checkid == 1) {  
		    	model.addAttribute("result", 2);
		    } else if (checknickname == 1) {
		    	model.addAttribute("result", 3);
		    } else if (!"true".equals(emailVerified)){
		    	model.addAttribute("result", 4);
		    } else {
		        int result = logonDao.insertMember(logonDto);
		        model.addAttribute("result", result);
		    }
		        return "member/inputPro";
		    
		}
} 