package com.fetefusion.FeteFusion.Interface;

import com.fetefusion.FeteFusion.Model.Event;

import java.util.List;

public interface EventServiceInterface {
    Event createEvent(Event event);
    Event viewEvent(Long id);
    List<Event> viewEvents();



}
