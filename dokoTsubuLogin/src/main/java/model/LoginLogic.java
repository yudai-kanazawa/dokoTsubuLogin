package model;

public class LoginLogic {
	public boolean isLogin(User user) {
		AccountsDAO dao = new AccountsDAO();
		Account account = dao.findByUserId(user);
		if(account == null) {
			return false;
		}else if(user.getPassword().equals(account.getPassword())) {
			return true;
		}else {
			return false;
		}
	}
}
