package mb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
<<<<<<< HEAD
@ComponentScan( basePackages={ "mb", "logon", "board","qna", "game", "rank", "control.quiz", "control.rank",
		"control.oxgame","control.wordgame", "control.logon", 
		"control.board","control.qna", "websocket" } )
@MapperScan( basePackages= { "logon", "board", "qna","game", "rank", "quiz.oxgame","quiz.wordGame" } )
=======
@ComponentScan( basePackages={ "mb", "logon", "board", "qna", "mail", "websocket", "control.quiz",
		"control.oxgame", "control.wordgame", "control.logon", "control.board", "control.qna" } )
@MapperScan( basePackages= { "logon", "board", "qna","mail", "quiz.oxgame","quiz.wordGame" } )
>>>>>>> 94559a698e65f1ec2f19c305832979a4fe60f9d7
public class MBApplication {
	public static void main(String[] args) {
		SpringApplication.run( MBApplication.class );		
	}
}

// localhost:8080/logonmain
// localhost:8080/boardlist
 	