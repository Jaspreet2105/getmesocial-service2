package com.spring22.Consult.service;

import com.spring22.Consult.model.TeamMembers;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {

        public List<TeamMembers> getTeamMembers(){

                List<TeamMembers> teamMembers = new ArrayList<>();

                TeamMembers teamMembers1 = new TeamMembers(1,"https://play-lh.googleusercontent.com/I-Yd5tJnxw7Ks8FUhUiFr8I4kohd9phv5sRFHG_-nSX9AAD6Rcy570NBZVFJBKpepmc",
                        "JassiTest1", "Test Description1");

                TeamMembers teamMembers2 = new TeamMembers(2,"https://play-lh.googleusercontent.com/I-Yd5tJnxw7Ks8FUhUiFr8I4kohd9phv5sRFHG_-nSX9AAD6Rcy570NBZVFJBKpepmc",
                        "JassiTest2", "Test Description2");

                TeamMembers teamMembers3 = new TeamMembers(3,"https://play-lh.googleusercontent.com/I-Yd5tJnxw7Ks8FUhUiFr8I4kohd9phv5sRFHG_-nSX9AAD6Rcy570NBZVFJBKpepmc",
                        "JassiTest3", "Test Description3");


                teamMembers.add(teamMembers1);
                teamMembers.add(teamMembers2);
                teamMembers.add(teamMembers3);

                return teamMembers;


        }

        public List<TeamMembers> searchedTeamMembers(String teamMemberName){

                List<TeamMembers> teamMembers = new ArrayList<>();

                TeamMembers teamMembers1 = new TeamMembers(1,"https://play-lh.googleusercontent.com/I-Yd5tJnxw7Ks8FUhUiFr8I4kohd9phv5sRFHG_-nSX9AAD6Rcy570NBZVFJBKpepmc",
                        teamMemberName, "Test Description1");

                //TeamMembers teamMembers2 = new TeamMembers(2,"https://play-lh.googleusercontent.com/I-Yd5tJnxw7Ks8FUhUiFr8I4kohd9phv5sRFHG_-nSX9AAD6Rcy570NBZVFJBKpepmc",
                        //"Test2", "Test Description2");

                //TeamMembers teamMembers3 = new TeamMembers(3,"https://play-lh.googleusercontent.com/I-Yd5tJnxw7Ks8FUhUiFr8I4kohd9phv5sRFHG_-nSX9AAD6Rcy570NBZVFJBKpepmc",
                        //"Test3", "Test Description3");


                teamMembers.add(teamMembers1);
                //teamMembers.add(teamMembers2);
               // teamMembers.add(teamMembers3);

                return teamMembers;


        }



}
