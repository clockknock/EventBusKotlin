package com.werb.eventbuskotlin

import com.werb.eventbus.IEvent

/** Created by wanbo <werbhelius@gmail.com> on 2017/8/31. */

class CardDeleteEvent: IEvent {
    var position: Int = -1
}