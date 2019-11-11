package service.skirmish;

import entity.Skirmish;

public interface ISkirmishStandardService {

    Skirmish receiveWinner(Skirmish[] candidatesForSkirmish);
}
