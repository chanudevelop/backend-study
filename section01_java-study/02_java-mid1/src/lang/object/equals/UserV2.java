package lang.object.equals;

import java.util.Objects;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

//    @Override
//    public boolean equals(Object obj) {
//        // obj로 넘어온 UserV2가 나 자신과 같은지 확인하는 함수 만들기
//        // 다운캐스팅 안하면 Object타입에는 id가 없기때문에 다운캐스팅을 해줘야함
//        UserV2 user = (UserV2) obj;
//        return id.equals(user.id); // id는 String 타입!! -> String 타입은 equals()로 비교해라
//    }


    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        UserV2 userV2 = (UserV2) object;
        return Objects.equals(id, userV2.id);
    }

}
