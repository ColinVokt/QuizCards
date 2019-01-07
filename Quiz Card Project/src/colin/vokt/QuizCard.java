package colin.vokt;

public class QuizCard {
	//set up fields / attributes of a quiz card
	private String questions;
	private String answer;
	
	
	// build constructer that builds a quiz card
	public QuizCard(String questions, String answer) {
		this.questions = questions;
		this.answer = answer;
	}


	public String getQuestions() {
		return questions;
	}


	public void setQuestions(String questions) {
		this.questions = questions;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
	

}
