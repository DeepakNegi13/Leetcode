/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function (nums, fn, init) {
    nums.map(elem => {
        let val = fn(init, elem)
        init = val;
    })
    return init;
};