package command.executer.commands.appointmnentcommands;

import command.CommandType;
import command.executer.AbstractCommandExecutor;
import moduls.Appointment;
import moduls.Client;
import moduls.Staff;

public class ClientAppointmentViewer extends AbstractCommandExecutor {
    @Override
    public int execute(String command) {
        return viewClientAppointments(command);
    }

    @Override
    public CommandType getCommandType() {
        return CommandType.VIEW_CLIENT_APPOINTMENTS;
    }

    private int viewClientAppointments (String command){

//        view client appointments Rodionov Ivan Vladimirovich


        var wordArray = command.split(" ");
        var lastName = wordArray[3];
        var firstName = wordArray[4];
        var middleName = wordArray[5];


//        Client newClient = new Client (lastName, firstName, middleName);
        Client client = clientRepository.getClient(new Client(lastName, firstName, middleName));
//        Staff staff = staffRepository.getStaff(new Staff(staffLastName, staffFirstName, staffMiddleName));
//        Staff newStaff = new Staff(lastName, firstName, middleName);

        if(client == null){
            System.out.println("Client not found");
            return -1;
        }

        for (Appointment appointment :
                appointmentRepository.getAppointment(client)) {
            System.out.println(appointment.printInfo());
        }

        return 1;
    }
}
