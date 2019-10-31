package ssafy.member.repo;
import java.util.ArrayList;
import ssafy.member.domain.MemberDTO;
public interface MemberDAO {
    void memberInsert(MemberDTO memberDTO);
    void memberUpdate(MemberDTO memberDTO);
    void memberDelete(String name);
    MemberDTO MemberSelectOne(String name);
    ArrayList<MemberDTO> MemberSelectList();
}
