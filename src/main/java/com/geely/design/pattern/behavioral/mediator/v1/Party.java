package com.geely.design.pattern.behavioral.mediator.v1;

public interface Party {

    void addMember(PartyMember member);

    void act(PartyMember actor, Action action);

}
