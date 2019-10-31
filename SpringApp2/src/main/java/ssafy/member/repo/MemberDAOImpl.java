package ssafy.member.repo;
import java.util.ArrayList;
import org.springframework.stereotype.Component;
import ssafy.member.domain.MemberDTO;
@Component(value="memberdao")
public class MemberDAOImpl implements MemberDAO{
    
    @Override
    public void memberInsert(MemberDTO memberDTO) {
        // TODO Auto-generated method stub
        System.out.println("추가");
    }
    @Override
    public void memberUpdate(MemberDTO memberDTO) {
        // TODO Auto-generated method stub
        System.out.println("갱신");
    }
    @Override
    public void memberDelete(String name) {
        // TODO Auto-generated method stub
        System.out.println("삭제");
    }
    @Override
    public MemberDTO MemberSelectOne(String name) {
        // TODO Auto-generated method stub
         System.out.println("하나조회");
        return null;
    }
    @Override
    public ArrayList<MemberDTO> MemberSelectList() {
        // TODO Auto-generated method stub
          System.out.println("리스트 조회");
        return null;
    }
}