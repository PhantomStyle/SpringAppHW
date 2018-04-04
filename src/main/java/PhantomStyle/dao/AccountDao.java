package PhantomStyle.dao;

import PhantomStyle.domain.Account;

import java.util.List;

public interface AccountDao {
    List getAll();

    Account getById(Long id);

    Account getByOwner(String owner);
}
