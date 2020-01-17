package rest.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import rest.database.MySQL;
import rest.entity.EntityAdvert;

public class RepositoryAdvert {

	public boolean createAdvert(EntityAdvert advert) {
		try(Connection connection = MySQL.getConnection()) {
			if(connection == null || !findUserById(advert.getAdvertAuthorId())) {
				return false;
			}
			PreparedStatement statement = connection.prepareStatement("INSERT INTO adverts VALUES(?, ?, ?, ?, ?, ?, ?)");
			statement.setInt(1, advert.getAdvertId());
			statement.setString(2, advert.getAdvertHeader());
			statement.setString(3, advert.getAdvertBody());
			statement.setString(4, advert.getAdvertCategory());
			statement.setString(5, advert.getAdvertPhoneNumber());
			statement.setString(6, advert.getAdvertDateTime());
			statement.setInt(7, advert.getAdvertAuthorId());
			statement.executeUpdate();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	public EntityAdvert findAdvertById(int id) {
		try(Connection connection = MySQL.getConnection()) {
			if(connection == null) {
				return null;
			}
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM adverts WHERE id = ?");
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			if(result.next()) {
				return new EntityAdvert(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6), result.getInt(7));
			}
			return null;
		} catch (SQLException e) {
			return null;
		}
	}

	public boolean deleteAdvertById(int id) {
		try(Connection connection = MySQL.getConnection()) {
			if(connection == null) {
				return false;
			}
			PreparedStatement statement = connection.prepareStatement("DELETE FROM adverts WHERE id = ?");
			statement.setInt(1, id);
			int result = statement.executeUpdate();
			if(result == 1) {
				return true;
			}
			return false;
		} catch (SQLException e) {
			return false;
		}
	}

	public boolean findUserById(int id) {
		try(Connection connection = MySQL.getConnection()) {
			if(connection == null) {
				return false;
			}
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE id = ?");
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			if(result.next()) {
				return true;
			}
			return false;
		} catch (SQLException e) {
			return false;
		}
	}

}