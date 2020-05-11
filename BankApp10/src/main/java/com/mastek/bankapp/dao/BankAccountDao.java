package com.mastek.bankapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import com.mastek.bankapp.model.BankAccount;
import com.mastek.bankapp.model.SavingAccount;

public class BankAccountDao implements IDao<BankAccount> {
	
	@Override
	public Set<BankAccount> findAll() {
		final Set<BankAccount> recordSet = new HashSet<>();
		final String sql = "select * from bankaccount;";
		try (Connection connection = DBConnection.getConnection();
				Statement select = connection.createStatement();
				ResultSet records = select.executeQuery(sql);) {

			while (records.next()) {
				final BankAccount account = new SavingAccount(records.getInt("accno"), records.getString("accName"),
						records.getDouble("balance"));
				recordSet.add(account);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return recordSet;
	}
	
	@Override
	public BankAccount findById(long id) {
		BankAccount account = new SavingAccount();
		final String sql = "select * from bankaccount where accno=?;";
		
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement select = connection.prepareStatement(sql);
				) {
			
			select.setLong(1,id);
			ResultSet records = select.executeQuery();
			
			if (records.next()) {
				account.setAccNo(records.getInt("accno"));
				account.setAccName(records.getString("accName"));
				account.setBalance(records.getDouble("balance"));
			} else {
				account=null;
				}
			
			records.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return account;
	}

	@Override
	public boolean add(BankAccount t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(BankAccount account) {
		final String sql="delete from bankaccount where accno=?;";
		try(Connection connection=DBConnection.getConnection();
			PreparedStatement delete=connection.prepareStatement(sql);
			){
			delete.setInt(1, account.getAccNo());
			int i=delete.executeUpdate();
			if(i>0) {
				return true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(long id, BankAccount account) {
		final String sql="update bankaccount "
				+ "set accName=?"
				+ "set balance=?"
				+ "where accno=?;";
		try(Connection connection=DBConnection.getConnection();
			PreparedStatement update=connection.prepareStatement(sql);
			){
			update.setString(1, account.getAccName());
			update.setDouble(2, account.getBalance());
			update.setInt(3, account.getAccNo());
			
			int i=update.executeUpdate();
			if(i>0) {
				return true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
