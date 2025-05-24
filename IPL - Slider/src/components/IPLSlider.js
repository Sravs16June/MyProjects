import React, { useEffect, useState } from "react";
import axios from "axios";
import Slider from "react-slick";
import "slick-carousel/slick/slick.css";
import "slick-carousel/slick/slick-theme.css";
import "./IPLSlider.css"; // Optional CSS

const IPLSlider = () => {
    const [teams, setTeams] = useState([]);

    useEffect(() => {
        axios.get("http://localhost:8080/api/teams")
            .then(res => setTeams(res.data))
            .catch(err => console.error(err));
    }, []);

    const settings = {
        dots: true,
        infinite: true,
        speed: 800,
        slidesToShow: 1,
        slidesToScroll: 1,
        autoplay: true,
        autoplaySpeed: 3000,
        cssEase: "ease-in-out",
    };

    return (
        <div className="slider-container">
            <Slider {...settings}>
                {teams.map((team, index) => (
                    <div key={index}>
                        <img src={`/ipl-logos/${team.logoUrl}`} alt={team.name} />
                        <h2>{team.name}</h2>
                        <p>{team.tagline}</p>
                    </div>
                ))}
            </Slider>
        </div>
    );
};

export default IPLSlider;
