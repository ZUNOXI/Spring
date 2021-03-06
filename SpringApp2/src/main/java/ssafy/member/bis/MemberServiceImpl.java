package ssafy.member.bis;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ssafy.member.domain.MemberDTO;
import ssafy.member.repo.MemberDAO;
@Component(value = "memberser")
@Scope(value="prototype")
public class MemberServiceImpl implements MemberService {
	@Autowired
	@Qualifier("memberdao")
	MemberDAO dao;
	
	MemberServiceImpl() {}
	
	@Override
	public void memberInsert(String name, String age) {
		dao.memberInsert(new MemberDTO(name, Integer.parseInt(age)));
	}
	@Override
	public void memberUpdate(String name, String age) {
		dao.memberUpdate(new MemberDTO(name, Integer.parseInt(age)));
	}
	@Override
	public void memberDelete(String name) {
		dao.memberDelete(name);
	}
	@Override
	public MemberDTO memberSelectOne(String name) {
		return dao.MemberSelectOne(name);
	}
	@Override
	public ArrayList<MemberDTO> memberSelectList() {
		return dao.MemberSelectList();
	}
}