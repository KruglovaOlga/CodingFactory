package gr.aueb.cf.ch16interface;

/**
 * A place where animals learn to speak
 */
public class GenericSpeakingSchool {
    //tightly coupled with Cat
    //private final Cat cat = new Cat();

    private final ISpeakable speakable ;

    //inject dependency in constructor (Dependency injection or Inversion of Control)
    public GenericSpeakingSchool(ISpeakable speakable) {
        this.speakable = speakable;
    }
    public void  learnToSpeak() {
        speakable.speak();
    }
}
