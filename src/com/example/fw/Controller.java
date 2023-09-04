/*

* Controller의 종류가 만약 여러개더라면?
* 초기화
* 실행
* 마무리
* */
public abstract class Controller {

  public void init(){
    System.out.println("초기화를 실행합니다.");
  }

  public void close(){
    System.out.println("코드를 마무리합니다.");
  }
  public void excute(){
    // 초기화
    // 실행
    // 마무리
  }
}
