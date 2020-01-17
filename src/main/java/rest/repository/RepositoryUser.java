package rest.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import rest.database.MySQL;
import rest.entity.EntityAdvert;
import rest.entity.EntityUser;

public class RepositoryUser {



	public boolean createUser(EntityUser user) {
		try(Connection connection = MySQL.getConnection()) {
			if(connection == null) {
				return false;
			}
			PreparedStatement statement = connection.prepareStatement("INSERT INTO users VALUES(?, ?, ?, ?, ?)");
			statement.setInt(1, user.getUserId());
			statement.setString(2, user.getUserName());
			statement.setString(3, user.getUserSurname());
			statement.setString(4, user.getUserEmail());
			statement.setString(5, user.getUserCategory());
			statement.executeUpdate();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	public List<EntityAdvert> findAdvertsByUserId(int id) {
		List<EntityAdvert> adverts = new ArrayList<EntityAdvert>();
		try(Connection connection = MySQL.getConnection()) {
			if(connection == null) {
				return adverts;
			}
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM adverts WHERE authorid = ?");
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				adverts.add(new EntityAdvert(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6), result.getInt(7)));
			}
			return adverts;
		} catch (SQLException e) {
			return adverts;
		}
	}

}
