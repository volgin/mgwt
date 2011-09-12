/*
 * Copyright 2010 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package de.kurka.mobile.showcase.client;

import com.google.gwt.place.shared.Place;

import de.kurka.gwt.mobile.mvp.client.Animation;
import de.kurka.gwt.mobile.mvp.client.AnimationMapper;
import de.kurka.mobile.showcase.client.activities.AboutPlace;
import de.kurka.mobile.showcase.client.activities.UIPlace;
import de.kurka.mobile.showcase.client.activities.animation.AnimationPlace;
import de.kurka.mobile.showcase.client.activities.animationdone.AnimationDissolvePlace;
import de.kurka.mobile.showcase.client.activities.animationdone.AnimationFadePlace;
import de.kurka.mobile.showcase.client.activities.animationdone.AnimationFlipPlace;
import de.kurka.mobile.showcase.client.activities.animationdone.AnimationPopPlace;
import de.kurka.mobile.showcase.client.activities.animationdone.AnimationSlidePlace;
import de.kurka.mobile.showcase.client.activities.animationdone.AnimationSlideUpPlace;
import de.kurka.mobile.showcase.client.activities.animationdone.AnimationSwapPlace;
import de.kurka.mobile.showcase.client.activities.button.ButtonPlace;
import de.kurka.mobile.showcase.client.activities.buttonbar.ButtonBarPlace;
import de.kurka.mobile.showcase.client.activities.elements.ElementsPlace;
import de.kurka.mobile.showcase.client.activities.popup.PopupPlace;
import de.kurka.mobile.showcase.client.activities.progressbar.ProgressBarPlace;
import de.kurka.mobile.showcase.client.activities.scrollwidget.ScrollWidgetPlace;
import de.kurka.mobile.showcase.client.activities.searchbox.SearchBoxPlace;
import de.kurka.mobile.showcase.client.activities.slider.SliderPlace;
import de.kurka.mobile.showcase.client.activities.tabbar.TabBarPlace;
import de.kurka.mobile.showcase.client.places.HomePlace;

/**
 * @author Daniel Kurka
 *
 */
public class PhoneAnimationMapper implements AnimationMapper {

	@Override
	public Animation getAnimation(Place oldPlace, Place newPlace) {

		if (oldPlace instanceof UIPlace && newPlace instanceof HomePlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SLIDE);
			animation.setDirection(true);
			return animation;
		}

		if (oldPlace instanceof AboutPlace && newPlace instanceof HomePlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SLIDE_UP);
			animation.setDirection(true);
			return animation;
		}

		if (oldPlace instanceof HomePlace && newPlace instanceof AboutPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SLIDE_UP);
			animation.setDirection(false);
			return animation;
		}

		if (oldPlace instanceof HomePlace && newPlace instanceof AnimationPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SLIDE);
			animation.setDirection(false);
			return animation;
		}

		if (oldPlace instanceof HomePlace && newPlace instanceof UIPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SLIDE);
			animation.setDirection(false);
			return animation;
		}

		if (oldPlace instanceof AnimationPlace && newPlace instanceof HomePlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SLIDE);
			animation.setDirection(true);
			return animation;
		}

		if (oldPlace instanceof UIPlace && newPlace instanceof ScrollWidgetPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SLIDE);
			animation.setDirection(false);
			return animation;
		}

		if (oldPlace instanceof ScrollWidgetPlace && newPlace instanceof UIPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SLIDE);
			animation.setDirection(true);
			return animation;
		}

		if (oldPlace instanceof UIPlace && newPlace instanceof ElementsPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SLIDE);
			animation.setDirection(false);
			return animation;
		}

		if (oldPlace instanceof ElementsPlace && newPlace instanceof UIPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SLIDE);
			animation.setDirection(true);
			return animation;
		}

		if (oldPlace instanceof UIPlace && newPlace instanceof ButtonBarPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SLIDE);
			animation.setDirection(false);
			return animation;
		}

		if (oldPlace instanceof ButtonBarPlace && newPlace instanceof UIPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SLIDE);
			animation.setDirection(true);
			return animation;
		}

		if (oldPlace instanceof UIPlace && newPlace instanceof SearchBoxPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SLIDE);
			animation.setDirection(false);
			return animation;
		}

		if (oldPlace instanceof SearchBoxPlace && newPlace instanceof UIPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SLIDE);
			animation.setDirection(true);
			return animation;
		}

		if (oldPlace instanceof UIPlace && newPlace instanceof TabBarPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SLIDE);
			animation.setDirection(false);
			return animation;
		}

		if (oldPlace instanceof TabBarPlace && newPlace instanceof UIPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SLIDE);
			animation.setDirection(true);
			return animation;
		}

		if (oldPlace instanceof UIPlace && newPlace instanceof ButtonPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SLIDE);
			animation.setDirection(false);
			return animation;
		}

		if (oldPlace instanceof ButtonPlace && newPlace instanceof UIPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SLIDE);
			animation.setDirection(true);
			return animation;
		}

		if (oldPlace instanceof UIPlace && newPlace instanceof PopupPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SLIDE);
			animation.setDirection(false);
			return animation;
		}

		if (oldPlace instanceof PopupPlace && newPlace instanceof UIPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SLIDE);
			animation.setDirection(true);
			return animation;
		}

		if (oldPlace instanceof UIPlace && newPlace instanceof ProgressBarPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SLIDE);
			animation.setDirection(false);
			return animation;
		}

		if (oldPlace instanceof ProgressBarPlace && newPlace instanceof UIPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SLIDE);
			animation.setDirection(true);
			return animation;
		}

		if (oldPlace instanceof UIPlace && newPlace instanceof SliderPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SLIDE);
			animation.setDirection(false);
			return animation;
		}

		if (oldPlace instanceof SliderPlace && newPlace instanceof UIPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SLIDE);
			animation.setDirection(true);
			return animation;
		}

		//animation

		if (oldPlace instanceof AnimationSlidePlace && newPlace instanceof AnimationPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SLIDE);
			animation.setDirection(true);
			return animation;
		}

		if (oldPlace instanceof AnimationPlace && newPlace instanceof AnimationSlideUpPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SLIDE_UP);
			animation.setDirection(false);
			return animation;
		}

		if (oldPlace instanceof AnimationSlideUpPlace && newPlace instanceof AnimationPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SLIDE_UP);
			animation.setDirection(true);
			return animation;
		}

		if (oldPlace instanceof AnimationPlace && newPlace instanceof AnimationDissolvePlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_DISSOLVE);
			animation.setDirection(false);
			return animation;
		}

		if (oldPlace instanceof AnimationDissolvePlace && newPlace instanceof AnimationPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_DISSOLVE);
			animation.setDirection(true);
			return animation;
		}

		if (oldPlace instanceof AnimationPlace && newPlace instanceof AnimationFadePlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_FADE);
			animation.setDirection(false);
			return animation;
		}

		if (oldPlace instanceof AnimationFadePlace && newPlace instanceof AnimationPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_FADE);
			animation.setDirection(true);
			return animation;
		}
		if (oldPlace instanceof AnimationPlace && newPlace instanceof AnimationFlipPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_FLIP);
			animation.setDirection(false);
			return animation;
		}

		if (oldPlace instanceof AnimationFlipPlace && newPlace instanceof AnimationPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_FLIP);
			animation.setDirection(true);
			return animation;
		}

		if (oldPlace instanceof AnimationPlace && newPlace instanceof AnimationPopPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_POP);
			animation.setDirection(false);
			return animation;
		}

		if (oldPlace instanceof AnimationPopPlace && newPlace instanceof AnimationPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_POP);
			animation.setDirection(true);
			return animation;
		}

		if (oldPlace instanceof AnimationPlace && newPlace instanceof AnimationSwapPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SWAP);
			animation.setDirection(false);
			return animation;
		}

		if (oldPlace instanceof AnimationSwapPlace && newPlace instanceof AnimationPlace) {
			Animation animation = new Animation();
			animation.setType(Animation.ANIMATION_SWAP);
			animation.setDirection(true);
			return animation;
		}

		return new Animation();
	}

}