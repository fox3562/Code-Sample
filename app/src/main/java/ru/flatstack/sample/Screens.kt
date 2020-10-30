package ru.flatstack.sample

import android.content.Context
import android.content.Intent
import androidx.fragment.app.Fragment
import ru.flatstack.sample.ui.addresses.AddressesFragment
import ru.flatstack.sample.ui.camera.CameraFragment
import ru.flatstack.sample.ui.container.create.ContCreateFragment
import ru.flatstack.sample.ui.container.edit.ContEditFragment
import ru.flatstack.sample.ui.container.list.ContListFragment
import ru.flatstack.sample.ui.main.MainActivity
import ru.flatstack.sample.ui.wh.current.WhCurrentFragment
import ru.flatstack.sample.ui.wh.list.WhListFragment
import ru.flatstack.sample.ui.operator.OperatorFragment
import ru.flatstack.sample.ui.owner.OwnerFragment
import ru.flatstack.sample.ui.params.ParamsFragment
import ru.flatstack.sample.ui.regional.RegionalFragment
import ru.flatstack.sample.ui.schedule.ScheduleFragment
import ru.flatstack.sample.ui.source.SourceFragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

object Screens {

    object Main : SupportAppScreen() {

        override fun getActivityIntent(context: Context): Intent? {
            return Intent(context, MainActivity::class.java)
        }
    }

    object WhList : SupportAppScreen() {

        override fun getFragment(): Fragment? {
            return WhListFragment.newInstance()
        }
    }

    object WhCurrent : SupportAppScreen() {

        override fun getFragment(): Fragment? {
            return WhCurrentFragment.newInstance()
        }
    }

    object Addresses : SupportAppScreen() {

        override fun getFragment(): Fragment? {
            return AddressesFragment.newInstance()
        }
    }

    object Params : SupportAppScreen() {

        override fun getFragment(): Fragment? {
            return ParamsFragment.newInstance()
        }
    }

    object ContList : SupportAppScreen() {

        override fun getFragment(): Fragment? {
            return ContListFragment.newInstance()
        }
    }

    object Owner : SupportAppScreen() {

        override fun getFragment(): Fragment? {
            return OwnerFragment.newInstance()
        }
    }

    object Operator : SupportAppScreen() {

        override fun getFragment(): Fragment? {
            return OperatorFragment.newInstance()
        }
    }

    object Schedule : SupportAppScreen() {

        override fun getFragment(): Fragment? {
            return ScheduleFragment.newInstance()
        }
    }

    object Source : SupportAppScreen() {

        override fun getFragment(): Fragment? {
            return SourceFragment.newInstance()
        }
    }

    object RegOperator : SupportAppScreen() {

        override fun getFragment(): Fragment? {
            return RegionalFragment.newInstance()
        }
    }

    object ContEdit : SupportAppScreen() {

        override fun getFragment(): Fragment? {
            return ContEditFragment.newInstance()
        }
    }

    object ContCreate : SupportAppScreen() {

        override fun getFragment(): Fragment? {
            return ContCreateFragment.newInstance()
        }
    }

    object Camera : SupportAppScreen() {

        override fun getFragment(): Fragment? {
            return CameraFragment.newInstance()
        }
    }
}