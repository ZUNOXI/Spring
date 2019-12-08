

지난 포스팅에 이어 두 번째 자바 포스팅입니다.



이번 포스팅으로 자바에 대한 대략적인 정리를 마치고 HTML과 CSS로 넘어가 보려 합니다.







# 1. 클래스(Class), 객체(Object), 인스턴스(Instance)의 차이는?





먼저 클래스, 객체, 인스턴스의 정의에 대해 알아보겠습니다.



클래스는 흔히 객체를 만들어내기 위한 설계도를, 객체는 그 설계도를 통해 구현할 대상을,



그리고 인스턴스는 그 설계도를 통해 만들어 내는 생산물들입니다.





쉽게 이해하기 위해 클래스를 와플 빵 틀에 비유해보겠습니다. 여기서 객체는 빵 틀을 통해 만들 빵의 종류인 



'와플'을 의미합니다. 즉, 빵 틀로 제작해서 나올 결과물의 종류, 성질이라고 할 수 있을 것입니다.



또한 인스턴스는 이런 빵틀로 만들어진 첫 번째 와플, 두 번째 와플, 세 번째 와플... 들처럼 각각의 생산물들을 의미합니다.







# 2. public, protected, private의 차이는 뭘까??





우리는 자바로 프로그래밍을 하다 보면 public static void 어쩌고 하며 클래스를 만드는 것을 볼 수 있습니다.



여기서 왜 public이라고 쓰이는지, 어떤 역할을 하는지 많은 분들이 궁금해합니다. 저도 그랬었고요!





우선 public은 자바의 접근제어자(Access Modifier)이며 public, default, protected, private으로 구분됩니다.



private, default, protected, public 순으로 점점 접근 가능한 범위가 커지게 되는데요,



먼저 접근제어자가 private로 설정되었다면 여기에 붙은 변수, 메소든 해당 클래스에서만 접근이 가능합니다.



default로 설정되었다면 즉, 설정이 되어 있지 않다면 같은 패키지 내에서는 변수, 메소드에 접근이 가능하고요.



protected는 동일 패키지 내의 클래스 혹은 상속받은 외부 패키지의 클래스에서 사용이 가능합니다.



마지막으로 public은 모든 클래스에서 접근하여 변수와 메소드를 사용할 수 있습니다. 







이렇게 설명하면 JAVA의 상속의 개념에 익숙하지 않으신 분들은 헷갈리실 수도 있기에..



조금 더 쉽게 비유하자면 아버지가 아들에게 상속하는 경우를 고려했을 때 private는 상속할 수 없는 것들(?)



칫솔, 면도기 등의 개인 위생품 정도? 가 될 수 있을 것 같습니다. protected는 집이나 차가 될 수 있겠죠?



아들 명의로 집이나 차를 상속시키면 아들을 사용할 수 있지만, 타인과는 공유할 수 없는 것일 겁니다.



public은 축구공, 책 등 의 상속받은 아들이 타인에게도 얼마든지 빌려 줄 수 있는 것들로 예를 들 수 있을 것입니다.



비유가 너무 날 것(?)이지만 이해에 조금이라도 도움이 되셨길 바랍니다 :) 







# 3. 객체 지향 프로그래밍의 특성





앞선 포스팅에서 절차 지향 프로그램과 객체 지향 프로그래밍의 특성을 설명하였습니다.



객체 지향 프로그래밍은 코드를 객체화시켜서 사용하기 때문에 유지보수에 용이하고



대규모 프로젝트 수행에 적합하다고 할 수 있는데요,



여기서 몇 가지의 객체 지향 프로그램의 특성에 대해 알아보겠습니다.







(1) 추상화(Abstract)



추상화는 특정 메소드에 대한 선언만이 존재하고 구현부가 없거나, 일부만 구현되어 있는 상태를 의미합니다.



이는 현업에서 프로젝트를 시작할 때 명세서를 보고 쌩으로 만들어가는 것보다 추상화된 클래스를 제공함으로써



구현 부만을 그대로 채워 나가면 된다는 것에서 그 과정이 간결하고 효율적이라는 점이 특징입니다. 





여기서 추상화(abstract class)와 Interface는 다른 것임을 확인할 필요가 있습니다.



'Interface'는 사용할 메소드들을 구현부 없이 나열하고 이를 구현할 클래스에서 별도로 메소드 내용을 입력하지만,



'추상화 클래스'에서는 일부 메소드는 구현이 되어있을 수도 있고, 해당 메소드는 오버라이드 해서 사용할 수 있으며



abstract처리되어 있는 메소드를 사용할 때만 구현부를 구현해 주면 되는 차이가 있습니다.



아래 블로그 포스팅에서 이해가 될만한 고양이 예시가 있어서 링크 첨부합니다 :) 

참고 : https://marobiana.tistory.com/58







(2) 캡슐화(Encapsulation)와 은닉화(Hidden)



단순히 생각하면 비슷해 보일 수 있는 특성이지만, 구조를 파고들면 차이가 있는 개념입니다.



은닉화는 앞서 말한 접근제어자를 이용하여 클래스에 대한 접근을 막고 getter, setter 메소드만을 이용하여



접근을 함으로써 데이터의 무결성을 가능 하게 하는 특성을 갖고 있습니다.





캡슐화는 단어 그대로 클래스를 적절한 은닉화하여 외부에서 내부의 구조를 알 수 없게 해주는 기능을 합니다.



캡슐화를 통해 사용자는 특정 클래스에서 제공하는 메소드를 사용할 때 메소드의 기능만 안다면



내부 코드 구조나 원리를 알 필요 없이 사용할 수 있습니다.







(3) 다형성(Polymorphism)



다형성의 기본 개념은 '같은 모양의 코드가 다른 역할을 하는 것'에서 시작합니다.



자바에서는 이를 두 가지 특성으로 활용하고 있습니다.





가. 오버 로딩(Overloading)



오버로딩은 같은 클래스 내에서도 다른 반환 인자 타입 혹은 다른 입력 인자 타입을 적용했을 때,



같은 메소드 명을 사용할 수 있게 끔 해주는 기능을 합니다.



이해를 돕기 위해 간단한 예제 소스를 보겠습니다.



1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
public class testjava {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(test("1"));
        System.out.println(test(1));
    }
    
    public static String test(String a) { // 입력 인자타입을 문자열로
        return "ZunoXI";
    }
    
    public static String test(int a) { // 입력 인자타입을 숫자로
        return "ZunoXI2";
    }
}

http://colorscripter.com/info#e" target="_blank" style="color:#4f4f4ftext-decoration:none">Colored by Color Scripter
http://colorscripter.com/info#e" target="_blank" style="text-decoration:none;color:white">cs
<출력 결과>

ZunoXI 
ZunoXI2





위의 소스처럼 'test'라는 2개의 메소드의 입력 인자를 문자열, 숫자로 다르게 함으로써



같은 이름의 메소드를 여러 개 사용할 수 있게 해주는 기능을 한다고 이해하면 되겠습니다.





나. 오버라이딩(Overriding)



오버라이딩은 상위 클래스에서 추상화하여 정의해 놓은 메소드를 상속받는 하위 클래스별로 서로 다른 방법의



메소드 구현이 가능하다는 것입니다.





마찬가지로 이해를 위한 예제 소스를 작성해 보겠습니다.



1
2
3
4
5
public interface testjavaimpl {

    public String test(String a);
}

http://colorscripter.com/info#e" target="_blank" style="color:#4f4f4ftext-decoration:none">Colored by Color Scripter
http://colorscripter.com/info#e" target="_blank" style="text-decoration:none;color:white">cs


'testjavaimpl'라는 인터페이스에 아래 test와 같은 메소드를 선언해 놨다면,



1
2
3
4
5
6
7
8
9
public class testjava implements testjavaimpl{

    @Override
    public String test(String a) {
        // TODO Auto-generated method stub
        return "Zunoxi";
    }
    
}
http://colorscripter.com/info#e" target="_blank" style="color:#4f4f4ftext-decoration:none">Colored by Color Scripter
http://colorscripter.com/info#e" target="_blank" style="text-decoration:none;color:white">cs
1
2
3
4
5
6
7
8
9
public class testjava2 implements testjavaimpl{

    @Override
    public String test(String a) {
        // TODO Auto-generated method stub
        return "Zunoxi2";
    }
    
}
http://colorscripter.com/info#e" target="_blank" style="color:#4f4f4ftext-decoration:none">Colored by Color Scripter
http://colorscripter.com/info#e" target="_blank" style="text-decoration:none;color:white">cs
위와 같이 'testjava', 'testjava2'라는 'testjavaimpl' 을 상속받는 클래스에



test라는 메소드를 다른 구성으로 구현할 수 있게 해주는 기능을 하는 것이 오버라이딩이라고 이해할 수 있겠습니다. 





(4) 상속(Inheritance)



본문 포스팅 내내 상속상속 했는데 여기서 상속이 무엇을 의미할까요??



먼저 상속은 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것을 의미합니다.





자바에서 상속은 extends와 implements로 구분되는데요,



implements를 통하여 인터페이스를 구현하게 되면 선언해 놓은 메소드를 오버라이드 하여



구현부 코드를 작성해 주고 사용해야만 하지만,



extends는 단어 그대로 클래스를 확장하는 개념이며



이는 상위 클래스에 있는 메소드를 오버라이드 하지 않고 그냥 호출만으로도 사용이 가능하다는 차이가 있습니다.





자바 같은 경우 기본적으로 상위 클래스(부모 클래스를) 두 개 이상 상속받는 '다중 상속'이 불가능한데



그 대안으로 인터페이스를 제공함으로 다중 상속을 비스무리(?) 하게 지원한다고 이해할 수 있습니다.



