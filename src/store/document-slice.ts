import { createSlice } from '@reduxjs/toolkit'
import { MotionValue } from 'framer-motion'

export const documentSlice = createSlice({
    name: 'doc',
    initialState: {
        value: 0,
        rawValue: 0,
        bodyHeight: Math.max(document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight)
    },
    reducers: {
        setScrollValue: (state, action) => {
            state.value = action.payload;
        },
        setScrollRawValue: (state, action) => {
            state.rawValue = action.payload;
        },
    },
})

// Action creators are generated for each case reducer function
export const { setScrollValue, setScrollRawValue } = documentSlice.actions

export default documentSlice.reducer