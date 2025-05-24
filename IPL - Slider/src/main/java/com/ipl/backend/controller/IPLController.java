package com.ipl.backend.controller;

import com.ipl.backend.model.IPLTeam;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teams")
@CrossOrigin(origins = "http://localhost:3000") // React app access
public class IPLController {

    @GetMapping
    public List<IPLTeam> getTeams() {
        return List.of(
                new IPLTeam("Gujarat Titans", "gt.jpg", "Aava De - Sounds Like Thunder, Strikes Like Lightning, We Stop at Nothing"),
                new IPLTeam("Rajasthan Royals", "rr.jpg", "Halla Bol"),
                new IPLTeam("Sunrisers Hyderabad", "srh.jpg", "Rise Up to Every Challenge"),
                new IPLTeam("Chennai Super Kings", "csk.jpg", "Whistle Podu!"),
                new IPLTeam("Mumbai Indians", "mi.jpg", "Duniya Hila Denge!"),
                new IPLTeam("Delhi Capitals", "dc.jpg", "Dildaar Dilli"),
                new IPLTeam("Kolkata Knight Riders", "kkr.jpg", "Korbo Lorbo Jeetbo"),
                new IPLTeam("Punjab Kings", "pbks.jpg", "Sada Punjab"),
                new IPLTeam("Royal Challengers Bengaluru", "rcb.jpg", "Play Bold"),
                new IPLTeam("Lucknow Super Giants", "lsg.jpg", "Bhavhar Ka Team")
        );
    }
}
