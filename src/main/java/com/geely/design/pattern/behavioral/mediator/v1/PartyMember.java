package com.geely.design.pattern.behavioral.mediator.v1;

public interface PartyMember {

    void joinedParty(Party party);

    void partyAction(Action action);

    void act(Action action);
}
