import week13.Actor;
import week13.DbUtil;
import week13.Query_Constants;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by Tivadar Bocz on 2017.05.23..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<Actor> actorList = new ArrayList<Actor>();
        Connection connection = DbUtil.getConnection();

        try {
            //3) Creating statement
            Statement statement = connection.createStatement();
            //4) Executing queries
            ResultSet rs = statement.executeQuery(Query_Constants.SELECT_ALL_ACTOR_WHERE_ID_GREATER_QUERY + "60");

            while (rs.next()) {
                Actor actor = new Actor();
                actor.setActorId(rs.getInt(1));
                actor.setFirstName(rs.getString(2));
                actor.setLastName(rs.getString(3));
                actor.setLastUpdate(rs.getString(4));
                /*System.out.print(rs.getInt(1) + "\t\t");//rs.getInt("id")
                System.out.print(rs.getString(2) + "\t\t");
                System.out.print(rs.getString(3) + "\t\t");
                System.out.print(rs.getString(4) + "\t");
                System.out.println();*/

                actorList.add(actor);
            }
            //5) Closing connection
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        //lista kiíratása
        for (Actor item : actorList) {
            System.out.println(item.toString());
        }







        /*try{
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(Query.SELECT_ALL_ACTOR_QUERY);
            /*PreparedStatement statement = connection.prepareStatement(Query.P_SELECT_ALL_ACTOR_QUERY_WHERE);
            statement.setInt(1,50);
            ResultSet rs = statement.executeQuery();*//*
            while(rs.next()){

                System.out.print(rs.getInt(1) + "\t\t");//rs.getInt("id")
                System.out.print(rs.getString(2) + "\t\t");
                System.out.print(rs.getString(3) + "\t\t");
                System.out.print(rs.getString(4) + "\t");
                System.out.println();
            }
            connection.close();
            statement.close();
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {

        }*/
    }
}
