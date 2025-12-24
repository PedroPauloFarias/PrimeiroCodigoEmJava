package aprendizagem.criandoExercecoes.src.model.entities;

import aprendizagem.criandoExercecoes.src.model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // Aqui é para formatar os dias

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Error in reservation: Check-out date must beafter check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime(); // Aqui eu irei pegar a diferença entre datas em milesegundos
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); // Aqui temos a converção de milisegundos para dias
    }

    public void updateDates(Date checkIn, Date checkOut)  {
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new DomainException("Error in reservation: Reservation dates for update must be future dates");
        }
        if (!checkOut.after(checkIn)) {
           throw new DomainException("Error in reservation: Check-out date must beafter check-in date");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override       // O toString é uma sobre-posição
    public String toString() {
        return "Room "
                + roomNumber
                + ", check-in: "
                + sdf.format(checkIn) // Aqui é para mostras a data ja formatada
                + ", check-out: "
                + sdf.format(checkOut) // Aqui é para mostras a data ja formatada
                + ", "
                + duration()
                + " nights";
    }
}
